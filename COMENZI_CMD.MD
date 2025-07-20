# Comenzi utile in CMD

> A executa sau a rula o comanda inseamna a apasa tasta ENTER dupa ce o comanda a fost scrisa.

## `mkdir`
Creeaza un folder nou (make directory)

```cmd
mkdir ProiectJava
```

## `rmdir`
Sterge un folder gol (remove directory)

```cmd
rmdir ProiectJava
```

## `rmdir /S`
Sterge un folder impreuna cu TOT ce este in el (fisiere + subfoldere) (remove directory)

```cmd
rmdir /S ProiectJava
```
> Necesita confirmare Yes/No

## `rmdir /S /Q`
Sterge un folder impreuna cu TOT ce este in el (fisiere + subfoldere) (remove directory)

```cmd
rmdir /S /Q ProiectJava
```
> Nu necesita confirmare de stergere

## `cd`
Intra intr-un folder (change directory)

```cmd
cd ProiectJava
```

## `cd .`
Ramane in directorul actual. (Nu are o functionalitate vizibila/practica)

```cmd
cd .
```

## `cd ...`
Intoarce in directorul parinte (cu un nivel mai sus)

```cmd
cd ..
```

Exemplu:
> Daca esti in C:\Utilizatori\Morgan\ProiectJava

> cd ..

> Vei ajunge in C:\Utilizatori\Morgan

## `notepad`
Deschide fisierul transmis ca parametru in Notepad. Daca nu exista, il creeaza.

```cmd
notepad Salut.java
```

## `javac`
Compileaza fisierul `.java` si creeaza un fisier `.class`

```cmd
javac Salut.java
```

## `java`
Ruleaza programul Java

```cmd
java Salut
```

## `dir`
Afiseaza toate fisierele si folderele din directorul curent

```cmd
dir
```

## `del`
Sterge un fisier (specificat ca argument)

```cmd
del Salut.class
```

## `javac -version`
Afiseaza versiunea instalata a compilatorului Java

```cmd
javac -version
```
> javac 20.0.2

## `java -version`
Afiseaza versiunea instalata a JVM

```cmd
java -version
```
> java version "20.0.2" 2023-07-18

> Java(TM) SE Runtime Environment ...

-----

## `cls`
Curata ecranul terminalului

```cmd
cls
```

## `echo`
Afiseaza un text in consola

```cmd
echo Salutare!
```

## `type`
Afiseaza continutul unui fisier text in consola.

```cmd
type Salut.java
```

## `copy`
Copiaza fisiere dintr-o locatie intr-alta

```cmd
copy fisier.txt backup\fisier.txt
```

## `move`
Muta fisiere (sau le redenumeste)

```cmd
move vechi.txt nou.txt
```

## `rename`
Redenumeste un fisier

```cmd
rename fisier.txt fisierNou.txt
```

## `exit`
Inchide fereastra CMD

```cmd
exit
```

## `color`
Schimba culoarea fundalului (background) si a textului (foreground) in CMD
> Culorile sunt codificate in cod HEX (baza 16)

```cmd
color A0
```

Pentru a gasi toate variantele executa `color -help`

Pentru a reveni la culorile default executa `color`

## `title`
Seteaza titlul ferestrei CMD

```cmd
title Proiecte Java
```

## `start`
Deschide o aplicatie sau un fisier cu aplicatia asociata

```cmd
start notepad Salut.java
```

```cmd
start https://google.com
```

## `tree`
Afiseaza structura directoarelor sub forma de arbore

```cmd
tree
```

## `date`
Afiseaza sau modifica data curenta

```cmd
date
```

## `time`
Afiseaza sau modifica ora curenta

```cmd
time
```

## `ver`
Afiseaza versiunea sistemului de operare Windows

```cmd
ver
```

## `hostname`
Afiseaza numele calculatorului

```cmd
hostname
```

## `ping`
Verifica daca un alt calculator/server raspunde la retea

```cmd
ping google.com
```

## `tasklist`
Afiseaza toate procesele care ruleaza

```cmd
tasklist
```

```txt
Image Name                     PID Session Name        Session#    Mem Usage
========================= ======== ================ =========== ============
System Idle Process              0 Services                   0          8 K
System                           4 Services                   0     13,512 K
Secure System                   72 Services                   0     40,344 K
Registry                       132 Services                   0    110,444 K
mini-metars.exe               6148 Console                   10     42,404 K
```

## `taskkill /PID`
Inchide un proces (cu Process ID)

```cmd
taskkill /PID 6148
```
> SUCCESS: Sent termination signal to the process with PID 6148.

## `taskkill`
Inchide un proces (cu Process ID) fortat

```cmd
taskkill /PID 6148 /F
```

## `shutdown`
Inchide computerul

```cmd
shutdown /s /f /t 15
```

`/s` - shutdown

`/f` - inchide fortat toate aplicatiile care ruleaza

`/t 15` - time delay (in secunde); sistemul se va inchide in 15 secunde

Daca a fost executata o inchidere a sistemului programata si se doreste inchiderea imediata, se poate rula `shutdown /a`