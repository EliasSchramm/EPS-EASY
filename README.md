# EPS-EASY
A litle Java-UI-Lib

## What is EPS-EASY?

EPS-EASY is a Java-Libary based on JavaAWT. I write this to take the time, that GUI-writing takes, away so the user can focus on his main project.

You dont trust me?
With this few lines:

```
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
