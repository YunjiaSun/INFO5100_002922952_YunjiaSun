# INFO5100 Final Project <br>
## Image Management Tool <br>

### Contributor : 
002922952_Yunjia Sun
* front-end: CSS
* back-end: logic of [filter & filter save & alert] functions

002923509_Jiaye Li
* front-end: Layout
* back-end: logic of [upload files & covert format & covert save] functions


### Function : 
***Upload files and show properties:***
* Develop GUI to allow user to upload image three files from desktop/laptop
* When uploaded, show image(s) thumbnail(s) (100x100) to users on GUI
* Show image properties <br>

***Covert format:***
* Use Image IO/ImageMagick/JMagick to convert image to various formats
* Develop GUI to allow user to select which format(s) to convert the image(s) to
* Develop GUI to allow users to download converted images

***Filter function:***
* Use PixelReader & WritableImage to get the pixel of image
* Develop GUI to allow user to select which filter(Brighter/Darker/Grey) to edit the image to
* Develop GUI to allow users to download filtered images

***Alert Message:***
* Use alert message to guide user follow the correct opreation


### Design Pattern - MVC 
The MVC pattern divides the interactive application into three parts: Model, View and Controller.
This program uses javaFX and SceneBuilder as development language and interface design tools, which naturally conform to the MVC development model.

### UML
<img src = "https://github.com/YunjiaSun/INFO5100_002922952_YunjiaSun/blob/main/Test%20Image/UML.png" width = "600" height = "400">

### Inheritance, Encapsulation and Interfaces
Establish two interfaces of ImageCovert & ImageFilrer to realize the inheritance of subsidiary classes.
<img src = "https://github.com/YunjiaSun/INFO5100_002922952_YunjiaSun/blob/main/Test%20Image/Structure.png" width = "400" height = "250">


### Screenshots of various tests

Terminal Test<br>
<img src = "https://github.com/YunjiaSun/INFO5100_002922952_YunjiaSun/blob/main/Test%20Image/Test1.png" width = "400" height = "250">

Java Exceptions - Try...Catch<br>
<img src = "https://github.com/YunjiaSun/INFO5100_002922952_YunjiaSun/blob/main/Test%20Image/Test2.png" width = "400" height = "250">

Convert/Filter Test<br>
<img src = "https://github.com/YunjiaSun/INFO5100_002922952_YunjiaSun/blob/main/Test%20Image/filtertest.png" width = "400" height = "250">


### Source code
https://www.tabnine.com/code/java/methods/javafx.scene.image.Image/getPixelReader




