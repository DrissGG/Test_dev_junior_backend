# Tests recrutement pour dev junior backend

## Intro
_A faire en 5 min max_
Notre gitlab vous a envoyé un mail, il faut donc cloner vos repos pour être pret.
Ne pas oublier de commiter apres chaque exo.


### Exo 1 - Algorithme
Objectif : Sais-tu faire du code optimiser et propre ?    
Livrable : .java

Écrire une méthode qui prend en paramètre trois nombres entiers (int) et retourne true si exactement UN nombre est strictement positif (c'est-à-dire > 0).
Sinon, retourner false.

Écrire tous les tests unitaires.


### Exo 2 - REST API
Objectif : Sais-tu faire une REST API ?
Livrable : .java

Merci de créer une API connectée à une base de données avec ces routes :

    - GET sur /customers?last_name=paolo
        - [{"last_name":"paolo","customer_id":1}]
    - PUT sur /customers/3457 -> header={"key":"Magic_Key"} - payload={"first_name":"hector","age":30}
         - le client doit être majeur (+ de 18 ans), sinon retourner une erreur 400
         - si la "key" n'est pas correcte l'API doit retourner un message d'erreur 403 "La force n'est pas avec toi !"
         - si tout est ok, faire le traitement et retourner le code 200
    - GET sur /customers/age/average
        - 26,5 (par exemple, on veut une précision d'un chiffre après la virgule)

Le GET doit pouvoir retourner une erreur 404 si le client demandé n'existe pas.
Le livrable doit etre facilement executable pour la correction.


### Exo 3 - Model de donnée
* Le rendu de cet exercice peut prendre plusieurs formes : 
  - un schema fait via n'importe quel outils de votre choix (exemple draw.io) qui fait apparaitre les tables, les champs, les clés étrangères/primaires, les relations entre les tables
  - un script SQL de création de model de données
* 

On cherche à représenter le modèle de données simplifié d'une boîte de telecom.
Dans ce modèle on veut stocker les infos suivantes :
- le nom, prénom, date de naissance et l'adresse d'un client
- Un client peut avoir plusieurs abonnements de differents types :
    - un abonnement FIX qui contient un numéro de telephone, une adresse d'installation, un numéro de box, le nom de l'offre
    - un abonnement MOBILE qui contient un numéro de telephone, le nom de l'offre
- Un abonnement peut avoir plusieurs options, qui peuvent aussi avoir plusieurs sous-options


### Exo 4 - SQL
Méditation en cours !


### Exo 5 - GIT
Le but de cet exercice est de tester tes bases en git.
Il y a quelques fautes présentes dans le text de la classe main. Le but est de corriger ces fautes en partant de la branche "EXERCICE-5", et de les reporter sur la branche main.

Les fautes à corriger sont:
- le numero d'episode est le "IX" et pas le "VIII" (episode)
- remplacer "Padawan" par "Jedi" (body line 2)
