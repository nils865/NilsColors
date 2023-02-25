# NilsColors

Simple library for colored text output in Java

## Install

### Without Build tools

using VS Code, IntelliJ, Eclipse, etc.

Download [nils-color.jar](https://github.com/nils865/NilsColors/releases/tag/v1.0.0) and put it in your `lib` folder

### Maven

Add this to your `pom.xml` under `dependencies`

```xml
<dependency>
  <groupId>nils865</groupId>
  <artifactId>nils-color</artifactId>
  <version>1.0.1</version>
</dependency> 
```

## Guide

Import the Color class

```java
import nils865.nilsColor.Color;
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
