O padrão Factory Method fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados. 
É útil para centralizar a lógica de criação de objetos, tornando o código mais organizado e flexível.

# Contexto: Sistema de Notificações
Imagine um sistema que precisa enviar notificações por diferentes meios:

Email
SMS
Push Notification
Com o Factory Method, podemos criar uma fábrica de notificações para determinar qual tipo de notificação será criada com base na necessidade.


Explicação
Interface Notification: Define o método notifyUser() que todas as notificações precisam implementar.
Classes Concretas (EmailNotification, SMSNotification, PushNotification): Implementam a interface Notification e fornecem a lógica específica para enviar a notificação.
NotificationFactory: Contém o método createNotification(String type) que cria e retorna a instância correta de Notification com base no tipo.
Classe Main: O cliente (Main) utiliza a fábrica para criar as notificações sem se preocupar com a classe concreta
