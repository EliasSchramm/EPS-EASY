# EPS-EASY
A litle Java-UI-Lib

## What is EPS-EASY?

EPS-EASY is a Java-Libary based on JavaAWT. I write this to take the time, that GUI-writing takes, away so the user can focus on his main project.

You dont trust me?
With this few lines:

```java
  Form main = new Form("main");
  Text sampletext = new Text("sampletext");

  sampletext.setPos(500, 300);
  sampletext.setText("Hello World!");

  Window.addForm(main);
  main.add(sampletext);

  EPS.start();
```
...You will get this resulut:

![Sample](https://i.imgur.com/iK7L38x.png)

## Usage

All GUI elements must be placed on a `Form` and this Form needs to get initalized to the `window`.
Example for a blank window:

```java
  Form main = new Form("main");
  Window.addForm(main);
  EPS.start();
```

The window pops up with the command `EPS.start()`.

Any object needs a ID in its constructor. With that you can get the object later just by ID. 

## Content

### Forms

Forms are the base of all GUI elements in EPS-EASY

##### Constructor

`Form form = new Form(String ID);`

##### Add objects

You can add any object by `add(object)`

#### Important methods

|Method|Resulut|Description|
|--------|-----|----------|
|setScrollMultiplyer(int mult)|-|Set the scroll multiplyer|
|setMaxScroll(int max)|-|Set the max scroll height (in pixel)|
|add(object)|-|Add one of the folowing objects to the form: Text, InputField, Button, TextField, Image|
|setBackground_Image(Image img)|-|Set a image as background. Instead of a image you can also use a `String path`|
|setBackground_Color(Color background_Color)|-|Set the backgroundcolor. Only will show if there isnt a background image set| 
|getInputField()|`List<InputField>`|Returns a list of all Inputfields in the form.|
|getTextField()|`List<TextField>`|Returns a list of all Textfields in the form.|
|getButton()|`List<Button>`|Returns a list of all Buttons in the form.|
|getImage()|`List<Image>`|Returns a list of all Images in the form.|
|getText()|`List<Text>`|Returns a list of all Text in the form.|

#### Change forms

To change between forms use:
``Window.setAKT_FORM_ID(String aKT_FORM_ID)``java

### Text

A simple oneliner text

#### Constructor

`Text text = new Text(String ID);`

#### Important methods

|Method|Resulut|Description|
|--------|-----|----------|
|setCanScroll(boolean canScroll)|-|Set `true` if it should get effected by scrolling. (default: `false`)|
|setActive(boolean active)|-|Set `true` if it sould be visible. (default: `true`)|
|setPos(int x, int y)|-|Set the x/y position.|
|setTextSize(int textSize)|-|Set the textsize|
|setTextColor(Color textColor)|-|Set the textcolor|
|setText(String text)|-|Set the text|
|setFontFamily(String fontFamily)|-|Set the fontFamily|

### TextField

A simple multilined text within bounds

#### Constructor

`TextField textField = new TextField(String ID)`

#### Importand methods

|Method|Resulut|Description|
|------|-------|----------|
|setPos(int x, int y)|-|Set the x/y position|
|setCanScroll(boolean canScroll)|-|Set `true` if it should get effected by scrolling. (default: `false`)|
|setActive(boolean active)|-|Set `true` if it sould be visible. (default: `true`)|
|setMaxWidth(int maxWidth)|-|Set the maxWidth (default: `500`)|
|setBordersize(int bordersize)|-|Set the bordersize (default: `4`)|
|setHasBackground(boolean hasBackground)|-|Set `true` if it should get an extra background (default: `false`)|
|setHasBorder(boolean hasBorder)|-|Set `true` if it should get an border. (default: `true`)
|setBorderColor(Color borderColor)|-|Set the bordercolor.|
|setBackgroundColor(Color backgroundColor)|-|Set the backgroundcolor|
|setTextSize(int textSize)|-|Set the textsize|
|setTextColor(Color textColor)|-|Set the textcolor|
|setText(String text)|-|Set the displayed text|
|setFontFamily(String fontFamily)|-|Set the fontfamily|

