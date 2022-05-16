package pizzaIngredientFactory;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Chess createChess();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
