package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
@ResponseBody
public class SkillsController {

    @GetMapping
    public String listOfSkills() {
        return "<html>" +
                    "<h1>Skills Tracker</h1>" +
                    "<h2>We have a few skills we would like to learn.<br>Here is the list</h2>" +
                    "<body>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>CSS</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public  String favoritSkills() {
        return "<html>" +
                    "<body>" +
                        "<form action='favorites' method='POST'>" + //submit a request to base path
                            "<label>Name:" +
                                "<br><input type='text' name='name'>" +
                                "</label>" +
                                "<br><label>My Favorite Language:" +
                                "<br><select name='language1' id='fav-lang'>" +
                                    "<option value='select'>--Select--</option>" +
                                    "<option value='JavasScript'>JavaScript</option>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='CSS'>CSS</option>" +
                                    "<option value='Python'>Python</option>" +
                                "</select>" +
                            "</label>" +
                            "<br><label>My Second Favorite Language:" +
                                "<br><select name='language2' id='second-lang'>" +
                                    "<option value='select'>--Select--</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='CSS'>CSS</option>" +
                                    "<option value='Python'>Python</option>" +
                                "</select>" +
                            "</label>" +
                            "<br><label>My Third Favorite Language:" +
                                "<br><select name='language3' id='third-lang'>" +
                                    "<option value='select'>--Select--</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='CSS'>CSS</option>" +
                                    "<option value='Python'>Python</option>" +
                                "</select>" +
                            "</label>" +
                            "<br><input type='submit' value='Submit!'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="favorites") //take the action
    public String favoriteSkills(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<html>" +
                "<h1>" + name + "</h1>" +
                "<h2>List of Favorite Languages</h2>" +
                    "<body>" +
//                        "<ol>" +
//                            "<li>" + language1 + "</li>" +
//                            "<li>" + language2 + "</li>" +
//                            "<li>" + language3 + "</li>" +
//                        "</ol>" +

                //Bonus Missions: Reformat form page to use a table
                        "<table border='2'>" +
                            "<tr>" +
                                "<td>Most Favorite" + "</td>" +
                                "<td>" + language1 + "</td>" +
                            "</tr>" +
                            "<tr>" +
                                "<td>Second Favorite" + "</td>" +
                                "<td>" + language2 + "</td>" +
                            "</tr>" +
                            "<tr>" +
                                "<td>Third Favorite" + "</td>" +
                                "<td>" + language3 +  "</td>" +
                            "</tr>" +
                        "</table>" +
                    "</body>" +
                "</html>";
    }

}
