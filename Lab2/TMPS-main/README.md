

# Lab 2
# Structural Design Patterns

### Author: Novitchii Nichita, FAF-193

---

## Introduction

In this laboratory work were implemented structural design patterns, such as:
- ### Bridge

>The Bridge pattern is a structural design pattern used in software design to "separate abstraction and implementation so that they can change independently."

![Bridge](https://upload.wikimedia.org/wikipedia/ru/8/81/Bridgeuml.gif)

- ### Facade

>The Facade is a structural design pattern that allows you to hide the complexity of a system by reducing all possible external calls to a single object that delegates them to the corresponding objects in the system.

![Facade](https://upload.wikimedia.org/wikipedia/ru/2/2f/Facade.gif)

- ### Adapter

>The Adapter is a structural design pattern designed to organize the use of functions of an object that is not available for modification through a specially created interface.

![Adapter](https://upload.wikimedia.org/wikipedia/ru/thumb/0/04/Adapter_pattern.svg/941px-Adapter_pattern.svg.png)

## Implementation

The first pattern was implemented is `Bridge`:
Classes like `Student`, `Teacher` and `TestPaper` can be created with different number of attributes. 
There is Abstract Class `Device` that has basic implementation of methods for devices people use daily. There is also Class `Projector`, device to project the computer screen to a larger area, and also it extends `Device`. In addition there is `Remote` Class; this is regular remote control for devices, so a person can control device not touching it at all, only interacting with remote control. For example:
```java
        Projector projector = new Projector();
        Remote remote = new Remote(projector);
        remote.turnOn(); //turns on the projector on which remote is connected
        remote.turnOff(); //turns on the projector on which remote is connected
```

The next pattern was used is `Facade`:
If user doesn't want to interact with all the classes are used in the project, there is some basic actions he can perform using the `School` Class.

```java
        School school = new School();
        school.setSchoolName("Lakewood High School");
        school.createClass(14);
        school.turnOnClassProjector(0);
        school.createClassTest(2, theme, task);
```

The last design pattern is `Adapter`:
There is a Class called `PrincipalToTeacher` which, if it is needed can turn the `Principal` of the School into the `Teacher` and act like a teacher with some additional features.

```java
        school.setPrincipalInClass(1);
        school.teacherAction(1); //acts like a teacher, with some additions
```

## Results

- ### Bridge (Device, Projector, Remote) full code

![bridge1](https://user-images.githubusercontent.com/6358475/143413670-8d9a206c-b689-43f2-b7ac-245d91b9adfe.PNG)

![bridge2](https://user-images.githubusercontent.com/6358475/143413778-e366e308-f2ef-4a34-9816-6b2f9058e58a.PNG)

![bridge3](https://user-images.githubusercontent.com/6358475/143413811-2c837bb6-54a4-4f47-949a-bd307baa86e6.PNG)

- ### Bridge (Remote) in action

![remoteAction](https://user-images.githubusercontent.com/6358475/143414356-4fc86f04-6c86-4631-bba9-d3d0a82c4272.PNG)

- ### School (Facade) code snippet

![school](https://user-images.githubusercontent.com/6358475/143414558-1b4affbe-1c2e-47d1-a13c-69cfed262949.PNG)

- ### PrincipalToTeacher (Adapter) full code

![adapter](https://user-images.githubusercontent.com/6358475/143416325-d3b1ab87-256c-42d1-92d8-10494b240896.PNG)

- ### Partial output in the command line

![output](https://user-images.githubusercontent.com/6358475/143415079-f3e089a1-6b2e-4258-bd62-5f1e8d5ae4b1.PNG)

## Conclusions

During this laboratory work there were learned and implemented some Structural Design Patterns. All the mentioned patterns from list of objectives were learned, but because it is difficult to unite them to one concept, there were implemented only three of them.
