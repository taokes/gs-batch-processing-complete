#Spring Batch

Cette application a été développée pour mettre en pratique Spring Batch dans le cadre d’une formation JavaJEE de 57 jours. 
Cette formation, dispensée par Inti et commandée par Adaming, 
a pour objectif de former des ingénieurs issus de différentes formations aux bases de Java.

#Description du Batch

Une application qui reçoit toutes les heures, à partir d'un fichier, un 
ensemble d'informations utilisateurs d'un fichier à traiter placé dans resources\sample-data-inti.csv,
met le nom et prénom en majuscule et génère un mot de passe pour 
chaque utilisateur du fichier et l'insère dans une base de données mysql 8.0

#Environement :

	- Un éditeur de texte ou IDE préféré

	- JDK 1.8 ou version ultérieure

	- Gradle 4+ ou Maven 3.2+
	
	- MySql 8.0 et son Workbenck

Vous pouvez également importer le code directement dans votre IDE:

	- Spring Tool Suite (STS)

	- IntelliJ IDEA

#Pour tester cette application :

- Créer la base de donnée gs-batch-processing
- Renseigner le user et le password root pour la base gs-batch-processing dans le fichier properties
- Créer la table people à partir du script resources\schema-mysql-inti.sql
- Modifier éventuellement le port dans le fichier properties

