package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class HomeController {

@Autowired
    BookRepository bookRepository;

@RequestMapping("/")
    public String listBooks(Model model){
    model.addAttribute("bookList",bookRepository.findAll());
    return "list";
}
@GetMapping("/addBook")
    public String addBook(Model model){
    model.addAttribute("aBook", new Book());
    return "bookform";
}
@PostMapping("/process")
    public String processBook(@Valid Book book, BindingResult result){
    if (result.hasErrors()){
        return "bookform";
    }
    bookRepository.save(book);
    return "redirect:/";
}
@RequestMapping("/detail/{title}")
    public String showBook(@ModelAttribute("title") String title, Model model){
    model.addAttribute("aBook",bookRepository.findAll());
    return "show";
}
@RequestMapping("/update/{title}")
    public String updateBook(@ModelAttribute("title") String title, Model model){
    model.addAttribute("aBook",bookRepository.findAll());
    return "bookform";
}
@RequestMapping("/delete/{title}")
    public String delBook(@ModelAttribute("title") String number){
    bookRepository.delete("title");
    return "redirect:/";
}




}