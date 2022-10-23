Feature: Tasks
  @movile
  Scenario: Como usuario quiero crear una tarea para ver mi progreso en mis tareas

    Given que tengo abierto la app: whenDo
    When hago click en el boton [+]
    And ingreso el titulo: Tarea
    And ingreso la descripcion: esta es una tarea
    And hago click en boton [guardar]
    Then la tarea "Tarea" deberia ser creada