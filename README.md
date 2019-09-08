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
|------|-------|----------|
|Hi|whats|up|
