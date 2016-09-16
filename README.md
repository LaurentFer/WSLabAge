# WSLabAge
Création d'un webservice (renvoie l'âge)

Etapes : 

- 1- Création de la classe monAge dans le package model

- 2- Run de la cmd wsgen pour générer le wdsl et le schéma xsd

wsgen -wsdl -r D:\workspaceWS\LabAge -s D:\workspaceWS\LabAge\src -verbose -d D:\workspaceWS\LabAge\bin -keep -cp D:\workspaceWS\LabAge\bin model.monAge

- 3- Création du webservice (Test GlassFish OK)
