package Transport.Car.Enums;

public enum BodyTypePass {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private final String bodyTypePass;

    // always 'private'
    BodyTypePass(String bodyTypePass) {
        this.bodyTypePass = bodyTypePass;
    }

    public final BodyTypePass findBodyType(String bodyTypePass) {
        for (BodyTypePass type : values()) {
            if (type.getBodyType().equalsIgnoreCase(bodyTypePass)) {
                return type;
            }
        }
        return null;
    }

    private String getBodyType() {
        return this.bodyTypePass;
    }

    @Override
    public String toString() {
        return "BodyTypePass{" + bodyTypePass + '}';
    }
}
