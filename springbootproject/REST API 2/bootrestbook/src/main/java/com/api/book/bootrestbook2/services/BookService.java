package com.api.book.bootrestbook2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bootrestbook2.dao.BookRepository;
import com.api.book.bootrestbook2.entities.Book;

@Component
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    // public  static List<Book> list = new ArrayList<>();

    // static{
    //     list.add(new Book(12,"COTLEN COMPLETED REFERCE","XYZ"));
    //     list.add(new Book(13,"HEAD FIEST TO JAVA","ABC"));
    //     list.add(new Book(14,"THING IN JAVA","KSDF"));

    // }

        




        //GET ALL BOOKS
       public List<Book> getAllBooks(){
        List<Book> list =(List<Book>)this.bookRepository.findAll();

        return list;

    
        }



    //GET SINGLE  BOOK BY ID
    public Book getBookById(int id)

        {   Book book= null;
            try{

            // book = list.stream().filter(e->e.getId()==id).findFirst().get();
               book = this.bookRepository.findById(id);
                    }catch(Exception e){
                        e.printStackTrace();
            }
            return book;
        }
  

    //ADDING THE BOOK
    public Book addBook(Book b){
       // list.add(b);
       Book result = this.bookRepository.save(b);
        return result;
    }
   
                
     //DELETE BOOK
            public void deleteBook(int bid)
            {
            //    list.stream().filter(book -> book.getId()!=bid).
            //     collect(Collectors.toList());

            this.bookRepository.deleteById(bid);
            }



   //UPDATE THE BOOK
            /**
             * @param book
             * @param bookId
             */
            public void updateBook(Book book,int bookId) {
                // list.stream().map(b->{

                //     if(b.getId()==bookId){
                //         b.setTitle(book.getTitle());
                //         b.setAuthor(book.getAuthor());
                //     }
                //     return b;
                // }).collect(Collectors.toList());
                book.setId(bookId);
                bookRepository.save(book);
                

            }


    
}
