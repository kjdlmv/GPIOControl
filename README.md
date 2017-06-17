# GPIOControl
## Version is 0.1 Alpha now.

***

## 1.What is GPIOControl?
* It's a library, use Java language.

* It can use in Linux core system(Arm, x86_64 or i586).

* It can control your device on GPIO pin.

***

## 2.How to use it?
You can see all method on the JavaDoc.

I will tell you some way to use it.
***
### 2.1. How to construction a GPIOControl object?
```Java
 GPIOControl control = new GPIOControl(gpioNum);
 ```
 
You can construction a GPIOControl object like this.
***
There have a args, it's call "gpioNum", it's Integer type, please fill out your GPIO index at here.
***
### 2.2. How to export my pin?
```Java
 control.export();
 ```

It can export your pin.

If your pin is exporting, it will break.
***
### 2.3. How to set mode?
```Java
 control.setMode(mode);
 ```

 Like as that.

 There have a args, it's call "mode", it's byte[] type, you can fill out "OUT" or "IN" at here.
***
### 2.4. How to get mode?
```Java
 control.getMode();
```

Like as that.

It have a return object, it's byte[] type, you can use this construction method to let it convert to String:
```Java
String str = new String(bytes);
```
***
### 2.5. How to set value?
```Java
 control.setValue(value);
 ```

 Like as that.

 There also have a args, it's call "value", it's byte[] type, you can fill out a value, such as 1, 0, but you must convert it to byte[](You can use String.getBytes() method).
 > High is 1(char)

 > Low is 0(char)
***
### 2.6 How to get value?
```Java
control.getValue();
```

Like as that.

It will return a value, it's byte[] type, you also can use a construction method to let it convert to String.
***
### 2.7. How to unexport?
```Java
 control.unExport();
 ```

 It can unexport your pin.
 If your pin isn't exporting, it will break.
***
### 2.8. How to check my pin's export state?
```Java
 control.isExport();
 ```

 Like as it, this method will return a result, it's Boolean type, if it's export, will returning true, else, returning false.
***
### 2.9. How to change pin index in a Object?
```Java
 control.setPin(pinNum);
```

Like at it, this method have a args, it's call "pinNum", Int type.
***

## 3.Lisence
GPIOControl is using GNU/GPL lisence, so if you want to import it to your program, you need read the lisence.
***

## 4.About copy code
If you want copy my code to your code, I hope you can ask me in Issues. Using code isn't equals Copy code.
***

## 5.Thanks for
Thanks for RESBI's GPIO-lib-for-OrangePi project.
***

## Last
If you have some advices, you can tell me in Github's issues.

The project isn't complete, I am continually complete the code.