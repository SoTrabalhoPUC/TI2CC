import java.util.Scanner;
import com.google.cloud.language.v1.Document;
import com.google.cloud.language.v1.LanguageServiceClient;
import com.google.cloud.language.v1.Sentiment;
import com.google.cloud.language.v1.Document.Type;

public class SentimentAnalysisExample {
    public static void main(String[] args) throws Exception {
        String apiKey = "sua_chave_de_api_aqui";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o texto a ser analisado:");
        String texto = scanner.nextLine();
        scanner.close();
        try (LanguageServiceClient language = LanguageServiceClient.create()) {
            Document doc = Document.newBuilder()
                    .setContent(texto)
                    .setType(Type.PLAIN_TEXT)
                    .build();
            Sentiment sentiment = language.analyzeSentiment(doc).getDocumentSentiment();
            System.out.println("Sentimento: " + sentiment.getScore());
        }
    }
}
