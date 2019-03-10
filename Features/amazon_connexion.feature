Feature: Tester la connexion sur Amazon

  Scenario: Se connecter sur Amazon
    Given L'utilisateur ouvre le site web
    When L'utilisateur clique sur menu Votre compte
    And L'utilisateur clique sur le botton Identifiez-vous
    And L'ulitilsateur saisit l'email et le mot de passe
    And L'utilisateur clique sur le botton Identifiez-vous
    Then l'espace d'utilisateur s'ouvre
