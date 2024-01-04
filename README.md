## Tela de Login com Kotlin e Compose
  Um aplicativo simples de tela de login desenvolvido em Kotlin utilizando Jetpack Compose.



## :camera_flash: Screenshots
<!-- You can add more screenshots here if you like -->
<table>
  <tr>
    </td><td><img src="/result/Screenshot_1.png" width="260"></td><td><img src="/result/Screenshot_2.png" width="260"><td><img src="/result/Screenshot_3.png" width="260"><td><img src="/result/Screenshot_4.png" width="260">
  </tr>
</table>



## Tecnologias Utilizadas
    Kotlin
    Jetpack Compose
    Android Navigation Component
    Android Material3

  
  ## UI (Interface do Usuário):
    * Material Design Components: Componentes do Material Design, como TextField, Button, e Icon, para uma aparência consistente e seguindo as diretrizes de design do Material.
      
    * Modifiers: Modificadores do Jetpack Compose são usados para ajustar o layout e o estilo dos elementos da interface do usuário.
      
    * Preview: Anotações @Preview são utilizadas para fornecer visualizações no Android Studio.

## Estrutura do Projeto
O projeto está estruturado da seguinte forma:

    MainActivity.kt: Contém a lógica principal do aplicativo, configuração do Compose e definição do fluxo de navegação.
    MainScreen.kt: Implementação da tela principal do aplicativo.
    SignInScreen.kt: Implementação da tela de login.
    SignUpScreen.kt: Implementação da tela de cadastro.
    
## Fluxo de Navegação
O aplicativo utiliza o Android Navigation Component para gerenciar o fluxo de navegação entre as telas. As principais rotas são:

    main/{user}: Tela principal que recebe o nome do usuário como parâmetro.
    signIn: Tela de login.
    signUp: Tela de cadastro.
    
    
### TODO
- Melhorar estilização do app
- Novas funcionalidades

## Autor
Antonio Felipe Oliveira (www.linkedin.com/in/id-antonio-felipe)

## License
```
The MIT License (MIT)

Copyright (c) 2023 Antonio Felipe Oliveira

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
```
