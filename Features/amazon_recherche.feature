Feature: Tester la recherche sur Amazon

  Scenario: Effectuer une recherche sous Amazon
    Given L'utilisateur ouvre le site web
    When L'utilisateur tappe le sujet de recherche
    And L'utilisateur clique sur le botton recherche
    Then le titre de la fenetre doit contient le sujet de recherche
