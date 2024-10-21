package homework.homework2;

public class LuggageDeserializeUtil {
    private static final int LUGGAGE_NUMBER_INDEX = 0;
    private static final int LUGGAGE_WEIGHT_INDEX = 1;

    public static Luggage deserializeLuggage(String[] row) {
        String luggageNumber = row[LUGGAGE_NUMBER_INDEX];
        int luggageWeight = Integer.valueOf(row[LUGGAGE_WEIGHT_INDEX]);
        return new Luggage(luggageNumber, luggageWeight);
    }
}
