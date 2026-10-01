# AutoLoc 🚗

**AutoLoc** est une plateforme de gestion de location de véhicules multi-agences.
Ce dépôt contient le code source de l'application développée avec Java et Spring Boot.

## 🎯 Objectifs du projet
- Développer une API REST robuste pour la gestion des locations de véhicules.
- Permettre la collaboration et la gestion multi-agences.
- Assurer la persistance des données avec Spring Data JPA et MySQL.

## 👥 Acteurs du système
Suite à l'analyse de la Séance 1, les acteurs interagissant avec le système AutoLoc sont :
1. **Client** : Consulte les véhicules, effectue et gère ses réservations.
2. **Agent d'agence** : Gère les locations, les retours de véhicules et la flotte au niveau de son agence.
3. **Manager (Responsable d'agence)** : Supervise l'activité de son agence et génère des rapports.
4. **Administrateur** : Gère les accès, la configuration globale de la plateforme et supervise l'ensemble des agences.

---
*Atelier 0 - Mise en place de l'environnement de développement complétée.*