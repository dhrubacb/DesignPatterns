package main.java.gof.creational.builder;

public final class Entity {
    private final String attribute;

    public String getAttribute() {
        return attribute;
    }

    private Entity(EntityBuilder entityBuilder) {

        this.attribute = entityBuilder.attribute;
    }
    public static class EntityBuilder {
        private String attribute;
        public EntityBuilder() {
        }
        public EntityBuilder withAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public Entity build() {
            return new Entity(this);
        }
    }
}
