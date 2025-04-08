# 📆 Day 2 – Java Full Stack Developer Journey

Today I learned the basics of Java programming and completed 3 hands-on challenges and a pattern printing exercise!

---

## ✅ Topics Covered

- Installing JDK & IntelliJ IDEA
- Writing First Java Program
- Compiling and Running Code
- Project Structure in IDE
- JDK vs JVM vs JRE
- Importance of `main` method
- Showing Output to Console

---

## 💻 Coding Challenges

### 1️⃣ First Program
```java
public class FirstProgram {
    public static void main(String[] args) {
        System.out.print("My First Code");
    }
}

###2️⃣ Print “Good Morning”
class Morning {
    public static void main(String[] args) {
        System.out.print("Good Morning");
    }
}

###3️⃣ IntelliJ Project – Print “Subscribe”
class Subscribe {
    public static void main(String[] args) {
        System.out.println("Subscribe");
    }
}

###4️⃣ Pattern Printing
🔺 Increasing Triangle
*
* *
* * *
* * * *
* * * * *

🔻 Decreasing Triangle
* * * * *
* * * *
* * *
* *
*

🔷 Right-Aligned Triangle
        *
      * *
    * * *
  * * * *
* * * * *

✅ Pattern Code (Manual Version):
class Pattern {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");

        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");

        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }
}


