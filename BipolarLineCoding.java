public class BipolarLineCoding {

    public static void main(String[] args) {
        // Input digital signal
        String digitalSignal = "11001110";

        // Variables
        int lastVoltage = -1; // Start with negative for first '1'
        StringBuilder encodedSignal = new StringBuilder();

        // Encode the signal
        for (char bit : digitalSignal.toCharArray()) {
            if (bit == '1') {
                lastVoltage *= -1; // Alternate voltage
                encodedSignal.append(lastVoltage).append(" ");
            } else {
                encodedSignal.append("0 ").append(" "); // '0' as 0V
            }
        }

        // Display output
        System.out.println("Digital Signal: " + digitalSignal);
        System.out.println("Encoded Signal: " + encodedSignal.toString().trim());
    }
}
