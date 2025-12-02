import Decorator.ProcessingFeeDecorator;
import Decorator.TransactionFeeDecorator;


void main() {
    ProcessingFeeDecorator processingFeeDecorator = new ProcessingFeeDecorator(new TransactionFeeDecorator(() -> 20));

    IO.println("Total Amount: " + processingFeeDecorator.getAmount());
}
