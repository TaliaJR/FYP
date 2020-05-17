package FYP.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    //displays home html page
    @GetMapping("")
    public String displayHome() {

        return "home";
    }

    @GetMapping("email")
    public String displayEmail()
    {
        return "email";
    }

    @GetMapping("emailbody")
    public String displayEmailBody()
    {
        return "emailbody";
    }

    @GetMapping("emailforensictools")
    public String displayEmailForensicTools()
    {
        return "emailforensictools";
    }

    @GetMapping("emailheader")
    public String displayEmailHeader()
    {
        return "emailheader";
    }

    @GetMapping("emailphishing")
    public String displayEmailPhishing()
    {
        return "emailphishing";
    }

    @GetMapping("guidelinesandstandards")
    public String displayGuidelines()
    {
        return "guidelinesandstandards";
    }

    @GetMapping("hiddendata")
    public String displayHiddenData()
    {
        return "hiddendata";
    }

    @GetMapping("metadata")
    public String displayMetadata()
    {
        return "metadata";
    }

    @GetMapping("serverinvestigation")
    public String displayServer()
    {
        return "serverinvestigation";
    }


}

