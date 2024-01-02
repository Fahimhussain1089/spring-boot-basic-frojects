package com.codewithdurgesh.blog.servies.impl;

import java.util.List;

import java.util.stream.Collectors;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithdurgesh.blog.entities.Category;
import com.codewithdurgesh.blog.exceptions.ResourceNotFoundException;
import com.codewithdurgesh.blog.payloads.CategoryDto;
import com.codewithdurgesh.blog.repositories.CategoryRepo;
import com.codewithdurgesh.blog.services.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryRepo categoryRepo;
	@Autowired
	private ModelMapper modelMapper;
	
	/* "interface CategoryService" class ko ye wale methode override ker rhe hai use sequence me*/
	
//ye uske title or description ko add krega ek ek ker ke
	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		Category cat  = this.modelMapper.map(categoryDto,Category.class);
		Category addedCat = this.categoryRepo.save(cat);
		return this.modelMapper.map(addedCat, CategoryDto.class);
		
	}
//ye ttu apdate krega
	
	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
		
		Category cat =this.categoryRepo.findById(categoryId)
				.orElseThrow(()->
				new ResourceNotFoundException("Category", "Category Id", categoryId));
		
		cat.setCategoryTitle(categoryDto.getCategoryTitle());
		cat.setCategoryDescription(categoryDto.getCategoryDescription());
		

		Category updatedcat = this.categoryRepo.save(cat);
		
		return this.modelMapper.map(updatedcat, CategoryDto.class);
		
		
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		Category cat=this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundException("Category", "category id",categoryId));
		this.categoryRepo.delete(cat);
		
	}
//ye override methode single id or suki title ko show krega
	
	@Override
	public CategoryDto getCategory(Integer categorId) {
		Category cat = this.categoryRepo.findById(categorId).orElseThrow(()->new ResourceNotFoundException("Category", "category id", categorId));
		return this.modelMapper.map(cat, CategoryDto.class);
	}
	
	
//ye retrun krega all title or useke sab description  ko jo abhi tk add huye hai
	
	
	@Override
	public List<CategoryDto> getCategory() {
		List<Category> categories = this.categoryRepo.findAll();
		
		List<CategoryDto> catDtos= categories.stream().map((cat)->this.modelMapper.map(cat, CategoryDto.class)).collect(Collectors.toList());
		return catDtos;
	}

}
