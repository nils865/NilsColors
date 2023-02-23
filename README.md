# NilsColors

Simple library for colored text output in Java

## Guide

Import the Color class

```java
import nils865.Color;
```

Color your text:

```java
Color.fg.<color>(<text>);
```

`text` is the text to color

Available colors are

- black
- red
- green
- yellow
- blue
- magenta
- cyan
- white

You can also color the background of your text with:

```java
Color.bg.<color>(<text>);
```

These methods all return Strings to use after

### Example

Coloring the background black and the text white

```java
System.out.println(Color.bg.white(Color.fg.black("Hello World")));
```
