package cuongnguyen.tt.controller.user;


import cuongnguyen.tt.model.Country;
import cuongnguyen.tt.model.FileUpload;
import cuongnguyen.tt.utils.ReadFileUsingPOI;
import cuongnguyen.tt.utils.ResizeImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;


@Controller
@RequestMapping("/upload")
public class UploadFileController {
    @GetMapping("/image")
    public String getUpLoadImage(Model model){
        model.addAttribute("myFile", new FileUpload());
        return "user/uploadimg";
    }


    @Autowired
    ServletContext context;
    @PostMapping("/image")
    public String uploadImage(FileUpload myFile, Model model){
        model.addAttribute("message", "upload success");
        model.addAttribute("description", myFile.getDescription());
        try {
            String path_file_save = context.getRealPath("/resources/image/");
            MultipartFile multipartFile = myFile.getMultipartFile();
            String fileName = multipartFile.getOriginalFilename();
            File file = new File(path_file_save,fileName);
            BufferedImage bufferedImage = ResizeImage.resizeImage(multipartFile.getBytes());
            ImageIO.write(bufferedImage, "png", file);
            //multipartFile.transferTo(file);
        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("message", "upload error");
        }

        return "user/result";
    }


    @GetMapping("/excel")
    public String getUpLoadFileExcel(Model model){
        model.addAttribute("myFile", new FileUpload());
        return "user/uploadexcel";
    }

    @PostMapping("/excel")
    public String uploadExcel(FileUpload myFile, Model model){
        model.addAttribute("message", "upload success");
        model.addAttribute("description", myFile.getDescription());
        try {
            String path_file_save = context.getRealPath("/resources/excel/");
            MultipartFile multipartFile = myFile.getMultipartFile();
            String fileName = multipartFile.getOriginalFilename();
            File file = new File(path_file_save,fileName);
            String path = file.getPath();
            multipartFile.transferTo(file);
            List<Country> countryList = ReadFileUsingPOI.readFileUsingPOI(path);
            System.out.println(countryList);
        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("message", "upload error");
        }

        return "user/result";
    }

}
