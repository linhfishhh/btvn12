package Controller;

import Models.Student;
import Service.CRUD_Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    CRUD_Product CRUD_Product=new CRUD_Product();
    @RequestMapping("/show")
    public String home(HttpServletRequest request){
        request.setAttribute("List", CRUD_Product.List);
        return "/index.jsp";
    }
    @RequestMapping("/create")
    public String create(){
        return "WEB-INF/create.jsp";
    }
    @PostMapping("/create")
    public String showcreate(@ModelAttribute Student Student){
        CRUD_Product.add(Student);
        return "redirect:/show";
    }
    @GetMapping("/remove")
    public String remove(@RequestParam int index ){
        CRUD_Product.remove(index);
        return "redirect:/show";
    }
    @RequestMapping("/edit")
    public String edit(HttpServletRequest req,@RequestParam int index){
        req.setAttribute("Index",index);
        return "/WEB-INF/edit.jsp";
    }
    @PostMapping("/edit")
    public String getEdit(@RequestParam int index,@ModelAttribute Student Student){
        CRUD_Product.edit(index,Student);
        return "redirect:/show";
    }
}
