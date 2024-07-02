
import com.practica.Domain1.Arbol;
import com.practica.Service.ArbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

@Controller
@RequestMapping("/arboles")
public class ArbolController {

    @Autowired
    private ArbolService arbolService;

    private static String UPLOAD_DIR = System.getProperty("user.dir") + "/uploads";

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("arboles", arbolService.getArboles(false));
        return "arboles/list";
    }

    @GetMapping("/crear")
    public String crear(Model model) {
        model.addAttribute("arbol", new Arbol());
        return "arboles/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Arbol arbol, @RequestParam("file") MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            String fileName = file.getOriginalFilename();
            Path fileNameAndPath = Paths.get(UPLOAD_DIR, fileName);
            Files.write(fileNameAndPath, file.getBytes());
           
        }
        arbolService.save(arbol);
        return "redirect:/arboles";
    }

   
    

    @PostMapping("/actualizar")
    public String actualizar(@ModelAttribute Arbol arbol, @RequestParam("file") MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            String fileName = file.getOriginalFilename();
            Path fileNameAndPath = Paths.get(UPLOAD_DIR, fileName);
            Files.write(fileNameAndPath, file.getBytes());
            
        }
        arbolService.save(arbol);
        return "redirect:/arboles";
    }
    
   
    
     @GetMapping("/eliminar/{idArbol}")
    public String Eliminar(Arbol arbol) {
        
        return "redirect:/categoria/listado";
    }

}