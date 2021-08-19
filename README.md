## Repositório de estudos em Java

Início: 26-07-2021 - Em andamento

#### A princípio, estou estudando Java para trabalhar nos projetos de sistemas embarcados da [CAS Tecnologia](https://www.castecnologia.com.br).

### W3Schools

[Tutoriais (clique aqui)](https://www.w3schools.com/java/default.asp)

[Exercícios (clique aqui)](https://www.w3schools.com/java/exercise.asp)

<details>
  <summary>Java Tutorial</summary>

- [x] Java Syntax;
- [x] Java Comments;
- [x] Java Variables;
- [x] Java Data Types;
- [x] Java Type Casting;
- [x] Java Operators;
- [x] Java Strings;
- [x] Java Math;
- [x] Java Booleans;
- [x] Java If ... Else;
- [x] Java Switch;
- [x] Java While Loop;
- [x] Java For Loop;
- [x] Java Break / Continue;
- [x] Java Arrays;
  
</details>
<details>
  <summary>Java Methods</summary>

- [ ] Java Methods;
- [ ] Java Method Parameters;
- [ ] Java Method Overloading;
- [ ] Java Scope;
- [ ] Java Recursion;
</details>
<details>
  <summary>Java Classes</summary>

- [ ] Java OOP;
- [ ] Java Classes/Objects;
- [ ] Java Class Attributes;
- [ ] Java Class Methods;
- [ ] Java Constructors;
- [ ] Java Modifiers;
- [ ] Java Encapsulation;
- [ ] Java Packages / API;
- [ ] Java Inheritance;
- [ ] Java Polymorphism;
- [ ] Java Inner Classes;
- [ ] Java Abstraction;
- [ ] Java Interface;
- [ ] Java Enums;
- [ ] Java User Input;
- [ ] Java Date;
- [ ] Java ArrayList;
- [ ] Java LinkedList;
- [ ] Java HashMap;
- [ ] Java HashSet;
- [ ] Java Iterator;
- [ ] Java Wrapper Classes;
- [ ] Java Exceptions;
- [ ] Java RegEx;
- [ ] Java Threads;
- [ ] Java Lambda;

</details>
<details>
  <summary>Java File Handling</summary>

- [ ] Java Files;
- [ ] Java Create/Write Files;
- [ ] Java Read Files; 
- [ ] Java Delete Files;

</details>
<details>
<summary>Java How To</summary>

- [ ] Add Two Numbers; 

</details>
<details>
  <summary>Java Reference</summary>

- [ ] Java Keywords;
- [ ] Java String Methods;
- [ ] Java Math Methods;

</details>
<details>
  <summary>Java Examples</summary>

- [ ] Java Examples;
- [ ] Java Compiler;
- [ ] Java Exercises;
- [ ] Java Quiz;
- [ ] Java Certificate;
  
</details>

<hr>

<details>
  <summary>Projetos de estudo (clique aqui)</summary>

### Projeto: Pokedéx Reativo

#### [Desenvolvido por: @anabneri | Ana Beatriz Neri](https://github.com/anabneri/pokedex-youtube)

#### [Playlist no Youtube da @anabneri](https://www.youtube.com/watch?v=7DbPSiA4ENg&list=PLmdyvKzGNf-xpnHkvaut7FwlNt3_lsbYz)

#### [Artigo da @anabneri](https://dev.to/womakerscode/criando-seu-pokedex-com-spring-webflux-mongodb-deploy-no-heroku-21f5)

<details>
  <summary>O que é uma Pokedéx?</summary>
A Pokédex, também conhecida como Poké-Agenda no Brasil (e ainda como Dexter ou Dextette, dependendo da voz masculina ou feminina do aparelho) é uma enciclopédia virtual portátil de alta tecnologia que os treinadores Pokémon transportam para registra todas as espécies diferentes de Pokémon que são encontradas durante a sua viagem como treinadores. Em geral, quando são cumpridos determinados requisitos, a capacidade pode ser aumentada permitindo que a Pokédex possa armazenar dados de outros Pokémon, que não são comuns, assim como os Pokémon de outras regiões.

[Saiba mais](https://pokemon.fandom.com/pt-br/wiki/Pokédex)

<hr>
</details>

<details>
  <summary>Descrição do projeto</summary>
Neste projeto será criada uma aplicação de Create, Read, Update e Delete usando Spring Webflux, com os dados salvos num banco MongoDB e por fim hospedado na Amazon Web Services.

#### Arquitetura

- Elástica;
- Orientação a mensagens;
- Responsiva;
- Resiliente;

#### Tecnologias

- Java JDK 8;
- IDE IntelliJ IDEA CE;
- Maven 3;
- JUnit 5;
- Spring Reactive Web;
- Spring Data Reactive MongoDB;
- Embedded MongoDB Database;
- AWS;

> Spring Webflux é um módulo no SpringBoot, com ele além de criarmos um CRUD, podemos criar uma sequência de eventos, mas isso não quer dizer que sempre devemos usar aplicações reativas, tudo depende do seu cenário e da viabilidade.

<hr>
</details>

<details>
    <summary>Screenshots | GIFs</summary>
<img width="auto" src="https://github.com/HenriqueMAP/learning-java/blob/master/Pokedex/PokedexApplication.png?raw=true">
</details>

<details>
  <summary>Código de exemplo</summary>
  
  ```java
package com.hmap.pokedex;

import com.hmap.pokedex.model.Pokemon;
import com.hmap.pokedex.repository.PokedexRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class PokedexApplication {

  public static void main(String[] args) { SpringApplication.run(PokedexApplication.class, args); }

  @Bean
  CommandLineRunner init (ReactiveMongoOperations operations,PokedexRepository repository) {
    return args -> {
      Flux<Pokemon> pokedexFlux = Flux.just(
        new Pokemon(null, "Bulbassaur", "Seed", "OverGrow", 06.09),
        new Pokemon(null, "Charizard", "Fire", "Blaze", 90.05),
        new Pokemon(null, "Caterpie", "Earthworm", "Shield Dust", 02.09),
        new Pokemon(null, "Blastoise", "Shellfish", "Torrent", 	06.09))

        .flatMap(repository::save);

        pokedexFlux
          .thenMany(repository.findAll())
          .subscribe(System.out::println);
    };
  }
}
  ```
</details>
<hr>

### Mini Projeto: Interface GUI

#### Desenvolvido por: Alex Lee

#### [Vídeo no Youtube](https://www.youtube.com/watch?v=5o3fMLPY7qY)

<details>
    <summary>Descrição do projeto</summary>
Desenvolvimento de uma Interface Gráfica do Usuário (GUI), contendo um título fixo, um botão e um texto informando a quantidade de vezes que o botão foi pressionado.
</details>

<details>
    <summary>Screenshots | GIFs</summary>
<img width="auto" src="https://github.com/HenriqueMAP/learning-java/blob/master/AppGUI/AppGUI.png?raw=true">
</details>

<details>
  <summary>Código de exemplo</summary>
  
```java

    public class GUI implements ActionListener {
    
        private int explosionsCount = 0;
        private JFrame guiFrame;
        private JLabel explosionLabel;
        private JPanel guiPanel;
    
        public GUI() {
            guiFrame = new JFrame();
    
            JButton explosionButton = new JButton(" Clique aqui para explodir 🧨 ");
            explosionButton.addActionListener(this);
    
            explosionLabel = new JLabel("Número de explosões: 0");
    
            guiPanel = new JPanel();
            guiPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
            guiPanel.setLayout(new GridLayout(0,1));
            guiPanel.add(explosionButton);
            guiPanel.add(explosionLabel);
    
            guiFrame.add(guiPanel, BorderLayout.CENTER);
            guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            guiFrame.setTitle("GUI Explosiva 🔥");
            guiFrame.pack();
            guiFrame.setVisible(true);
        }
    
        public static void main(String[] args) {
            new GUI();
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            explosionsCount++;
            explosionLabel.setText("Número de explosões: " + explosionsCount);
        }
    }

  ```

</details>

<hr>

### Mini Projeto: String Reverse

#### Desenvolvido por: Alex Lee

#### [Vídeo no Youtube](https://youtu.be/orUTq3CahRE)

<details>
    <summary>Descrição do projeto</summary>
Desenvolvimento de um script que inverta a ordem de cada caractere na sentença da frase, de modo que a leitura seja invertida.
</details>

<details>
    <summary>Screenshots | GIFs</summary>
<img width="auto" src="https://github.com/HenriqueMAP/learning-java/blob/master/ReverseString/ReverseString.png?raw=true">
</details>

<details>
  <summary>Código de exemplo</summary>

```java

public class ReverseString {

    public static void main(String[] args) {

        final String reverseString = reverse("Explosion");
        System.out.println("String reverse: " + reverseString);
    }

    public static String reverse(String string) {
        final char[] stringLetters = new char[string.length()];

        int letterIndex = 0;
        for (int index = string.length()-1; index >= 0; index--) {
            stringLetters[letterIndex] = string.charAt(index);
            letterIndex++;
        }

        String stringReversed = "";
        for (int index = 0; index < string.length(); index++) {
            stringReversed = stringReversed + stringLetters[index];
        }

        return stringReversed;
    }
}

  ```

</details>

<hr>

### Mini Projeto: Loop Pattern

#### Desenvolvido por: Alex Lee

#### [Vídeo no Youtube](https://youtu.be/3gzvVPD3n0w)

<details>
    <summary>Descrição do projeto</summary>
Desenvolvimento de um script que obtém o número de estrelas solicitado ao usuário e imprime o valor elevado ao quadrado, porém mostrado como uma somatória de estrelas (ou asteriscos) em linhas diferentes.
</details>

<details>
    <summary>Screenshots | GIFs</summary>
<img width="auto" src="https://github.com/HenriqueMAP/learning-java/blob/master/LoopPattern/LoopPattern.png?raw=true">
</details>

<details>
  <summary>Código de exemplo</summary>

```java

public class LoopPattern {

    public static void main(String[] args) {
        System.out.println("Obi-Wan Kenobi says: Hello there! How many stars would you like?");
        Scanner scanKeyboard = new Scanner (System.in);
        int numberOfStars = scanKeyboard.nextInt();

        for(int indexIncreasingLineStar = 1; indexIncreasingLineStar <= numberOfStars; indexIncreasingLineStar++){

            for(int indexIncreasingRowStar = 0; indexIncreasingRowStar < indexIncreasingLineStar; indexIncreasingRowStar++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int indexDecreasingLineStar = (numberOfStars - 1); indexDecreasingLineStar > 0; indexDecreasingLineStar--){

            for(int indexDecreasingRowStar = 0; indexDecreasingRowStar < indexDecreasingLineStar; indexDecreasingRowStar++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

  ```
</details>

<hr>

### Mini Projeto: Arrow Keys

#### Desenvolvido por: Alex Lee

#### [Vídeo no Youtube](https://youtu.be/GAn5evoACsM)

<details>
    <summary>Descrição do projeto</summary>
Desenvolvimento de um script que obtém os eventos do teclado ao pressionar as teclas de setas e mostra essa contagem em uma janela GUI (Interface Gráfica do Usuário).
</details>

<details>
    <summary>Screenshots | GIFs</summary>
<img width="auto" src="https://github.com/HenriqueMAP/learning-java/blob/master/ArrowKeys/ArrowKeys.png?raw=true">
</details>

<details>
  <summary>Código de exemplo</summary>

```java

public class ArrowKeys {

    public ArrowKeys() {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setFocusable(true);

        JPanel panel        = new JPanel();
        JLabel upArrow      = new JLabel();
        JLabel downArrow    = new JLabel();
        JLabel leftArrow    = new JLabel();
        JLabel rightArrow   = new JLabel();

        panel.add(upArrow);
        panel.add(downArrow);
        panel.add(leftArrow);
        panel.add(rightArrow);

        frame.addKeyListener(new KeyListener() {

            int upArrowCount    = 0;
            int downArrowCount  = 0;
            int leftArrowCount  = 0;
            int rightArrowCount = 0;

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        upArrow.setText("Up: " + Integer.toString(upArrowCount++));
                        break;
                    case KeyEvent.VK_DOWN:
                        downArrow.setText("Down: " + Integer.toString(downArrowCount++));
                        break;
                    case KeyEvent.VK_LEFT:
                        leftArrow.setText("Left: " + Integer.toString(leftArrowCount++));
                        break;
                    case KeyEvent.VK_RIGHT:
                        rightArrow.setText("Right: " + Integer.toString(rightArrowCount++));
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        frame.add(panel);

        upArrow.setText("Up: 0");
        downArrow.setText("Down: 0");
        leftArrow.setText("Left: 0");
        rightArrow.setText("Right: 0");
    }

  ```

</details>

<hr>

### Mini Projeto: Add Numbers

#### Desenvolvido por: Alex Lee

#### [Vídeo no Youtube](https://youtu.be/dVTgNsv3pX4)

<details>
    <summary>Descrição do projeto</summary>
Desenvolvimento de um script que obtém os números digitados pelo usuário e retorna a soma de dois números.
</details>

<details>
    <summary>Screenshots | GIFs</summary>
<img width="auto" src="https://github.com/HenriqueMAP/learning-java/blob/master/AddNumbers/AddNumbers.png?raw=true">
</details>

<details>
  <summary>Código de exemplo</summary>

```java

public class AddNumbers {

    public static void main(String[] args) {
        Scanner scanKeyboard = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanKeyboard.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = scanKeyboard.nextInt();

        System.out.println("The result of the sum: " + (firstNumber + secondNumber));
    }
}

  ```
</details>

<hr>

### Mini Projeto: Random Numbers

#### Desenvolvido por: Alex Lee

#### [Vídeo no Youtube](https://youtu.be/ucS3vwP9jnk)

<details>
    <summary>Descrição do projeto</summary>
Desenvolvimento de um script que retorna números aleatórios com intervalo definido de 0 a 6.
</details>

<details>
    <summary>Screenshots | GIFs</summary>
<img width="auto" src="https://github.com/HenriqueMAP/learning-java/blob/master/RandomNumbers/RandomNumbers.png?raw=true">
</details>

<details>
  <summary>Código de exemplo</summary>

```java

public class RandomNumbers {

    public static void main(String[] args) {

        Random randomNumbers = new Random();
        int numberChosen = (randomNumbers.nextInt(6) + 1);

        System.out.println("Number randomly chosen: " + numberChosen);
    }

    public RandomNumbers() {
    }
}

  ```
</details>

<hr>

### Mini Projeto: Duplicate Characters

#### Desenvolvido por: Alex Lee

#### [Vídeo no Youtube](https://youtu.be/tqI18_X_uoc)

<details>
    <summary>Descrição do projeto</summary>
Desenvolvimento de um script que retorna caracteres repetidos dentro de uma String, inclusive espaços vazios.

- [ ] TODO - Melhoria: Analisar somente caracteres e não espaços vazios;
- [ ] TODO - Melhoria: Contar quantas vezes cada caractere foi repetido na String analisada.
</details>

<details>
    <summary>Screenshots | GIFs</summary>
<img width="auto" src="https://github.com/HenriqueMAP/learning-java/blob/master/DuplicateCharacters/DuplicateCharacters.png?raw=true">
</details>

<details>
  <summary>Código de exemplo</summary>

```java

public static void main(String[] args) {

        String sentence = "How many duplicates are there?";
        System.out.println(sentence);

        StringBuilder characters = new StringBuilder();
        StringBuilder duplicates = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            String current = Character.toString(sentence.charAt(i));

            if (characters.toString().contains(current)) {

                if (!duplicates.toString().contains(current)){
                    duplicates.append(current).append(",");
                }
            }

            characters.append(current);
        }

        System.out.println(duplicates);
    }

  ```
</details>

<hr>

### Mini Projeto: Prime Numbers

#### Desenvolvido por: Alex Lee

#### [Vídeo no Youtube](https://youtu.be/Hk9n0cWE2OI)

<details>
    <summary>Descrição do projeto</summary>
Desenvolvimento de um script que retorna todos os números primos a partir de um intervalo numérico informado pelo usuário.

</details>

<details>
    <summary>Screenshots | GIFs</summary>
<img width="auto" src="https://github.com/HenriqueMAP/learning-java/blob/master/PrimeNumbers/PrimeNumbers.png?raw=true">
</details>

<details>
  <summary>Código de exemplo</summary>

```java

public class PrimeNumbers {

    public static void main(String[] args) { System.out.println(findPrimes(1, 100)); }

    public static ArrayList<Integer> findPrimes(int startNumber, int endNumber) {

        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int number = startNumber; number < endNumber; number++) {

            boolean numberPrime = true;
            int numberPair = 2;
            float division = (float) (number / 2);
            int numberLeftOver = (number % numberPair);

            while (division >= numberPair) {
                if ( numberLeftOver == 0) {
                    numberPrime = false;
                    break;
                }

                numberPair++;
            }

            if (numberPrime) {
                primes.add(number);
            }
        }
        return primes;
    }
}

  ```
</details>

<hr>

### Mini Projeto: Palindromes

#### Desenvolvido por: Alex Lee

#### [Vídeo no Youtube](https://youtu.be/AoRYeB7Os3M)

<details>
    <summary>Descrição do projeto</summary>
Desenvolvimento de um script que retorna se uma frase ou palavra é palíndroma. Palímdroma é a palavra, grupo de palavras, verso ou número que se lê da mesma maneira da esquerda para a direita ou da direita para a esquerd 

</details>

<details>
    <summary>Screenshots | GIFs</summary>
<img width="auto" src="https://github.com/HenriqueMAP/learning-java/blob/master/Palindrome/Palindrome.png?raw=true">
</details>

<details>
  <summary>Código de exemplo</summary>

```java

public static void main(String[] args) {

        // Exemples: mom, dad, poop, race car, nurses run

        String original = "nurses run";
        original = original.replace(" ", "");

        String reverse = "";
        for( int index = (original.length() - 1); index >= 0; index--) {
            reverse += original.charAt(index);
            System.out.println(reverse);
        }

        boolean palindrome = true;
        for(int index = 0; (index < original.length()); index++) {

            if(original.charAt(index) != reverse.charAt(index)) {
                palindrome = false;
            }
        }

        if(palindrome) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome!");
        }
    }

 ```

</details>

</details>

<hr>

#### IDE: IntelliJ IDEA
<details>
<summary>Plugins</summary>

- [Atom Material Icons](https://plugins.jetbrains.com/plugin/10044-atom-material-icons);
- [Codota AI Autocomplete for Java](https://plugins.jetbrains.com/plugin/7638-codota-ai-autocomplete-for-java-and-javascript);
- [GitToolBox](https://plugins.jetbrains.com/plugin/7499-gittoolbox);
- [Material Theme UI](https://plugins.jetbrains.com/plugin/8006-material-theme-ui); 
- [Nyan Progress Bar](https://plugins.jetbrains.com/plugin/8575-nyan-progress-bar);
- [One Dark Theme](https://plugins.jetbrains.com/plugin/11938-one-dark-theme);
- [Rainbow Brackets](https://plugins.jetbrains.com/plugin/10080-rainbow-brackets);
- [Tabnine AI Code Completion](https://plugins.jetbrains.com/plugin/12798-tabnine-ai-code-completion-js-java-python-ts-rust-go-php--more);

</details>

<hr>

> ### Caso você queira ajudar a melhorar este repositório, qualquer ajuda é bem vinda.
> 
> ### **E que a força esteja com você.**
> 
> ### Desenvolvido por **HMAP | Henrique Matheus Alves Pereira** 🦁
