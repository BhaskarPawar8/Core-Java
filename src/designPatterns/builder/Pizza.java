package designPatterns.builder;

public class Pizza {
    private String dough;
    private String base;
    private boolean cheese;
    private boolean pepporoni;
    private boolean mushrooms;

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", base='" + base + '\'' +
                ", cheese=" + cheese +
                ", pepporoni=" + pepporoni +
                ", mushrooms=" + mushrooms +
                '}';
    }

    Pizza(Builder builder){
        this.dough = builder.dough;
        this.base = builder.base;
        this.cheese = builder.cheese;
        this.pepporoni = builder.pepporoni;
        this.mushrooms = builder.mushrooms;
    }

    static class Builder{

        private String dough;
        private String base;

        private boolean cheese;
        private boolean pepporoni;
        private boolean mushrooms;

        public Builder(String dough, String base){
            this.dough = dough;
            this.base = base;
        }

        public Builder addCheese(boolean addCheese){
            this.cheese = addCheese;
            return this;
        }

        public Builder addPepporoni(boolean pepporoni){
            this.pepporoni = pepporoni;
            return this;
        }

        public Builder addMushrooms(boolean mushrooms){
            this.mushrooms = mushrooms;
            return this;
        }
    }
}
