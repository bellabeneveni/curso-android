package com.cursoandroid.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
        // frases retiradas do site https://bit.ly/3FeXQFH
        String[] frases = {
                "O sucesso nasce do querer, da determinação e persistência em se chegar a um objetivo. Mesmo não atingindo o alvo, quem busca e vence obstáculos, no mínimo fará coisas admiráveis (José de Alencar)",
                "Se você quer ser bem-sucedido precisa de dedicação total, buscar seu último limite e dar o melhor de si mesmo (Ayrton Senna)",
                "Não crie limites para si mesmo. Você deve ir tão longe quanto sua mente permitir. O que você mais quer pode ser conquistado (Mary Kay Ash)",
                "Nenhum obstáculo será grande se a sua vontade de vencer for maior",
                "Dificuldades preparam pessoas comuns para destinos extraordinários (C.S Lewis)",
                "Nenhum homem será um grande líder se quiser fazer tudo sozinho ou se quiser levar todo o crédito por fazer isso (Andrew Carnegie)",
                "Bom mesmo é ir à luta com determinação, abraçar a vida com paixão, perder com classe e vencer com ousadia, porque o mundo pertence a quem se atreve e a vida é muito curta, para ser insignificante (Charlie Chaplin)",
                "Pessoas vencedoras não são aquelas que não falham, são aquelas que não desistem",
                "Só existem dois dias do ano em que você não pode fazer nada: um se chama ontem e outro amanhã (Dalai Lama)",
                "A vida é um constante recomeço. Não se dê por derrotado e siga adiante. As pedras que hoje atrapalham sua caminhada amanhã enfeitarão a sua estrada",
                "Ouse ir além, ouse fazer diferente e o poder lhe será dado! (José Roberto Marques)",
                "Ouse, arrisque, não desista jamais e saiba valorizar quem te ama, esses sim merecem seu respeito. Quanto ao resto, bom, ninguém nunca precisou de restos para ser feliz (Clarice Lispector)",
                "Para ser um campeão você tem que acreditar em si mesmo quando ninguém mais acredita (Muhammad Ali)",
                "No fim tudo dá certo, e se não deu certo é porque ainda não chegou ao fim (Fernando Sabino)",
                "Você nunca sabe que resultados virão da sua ação. Mas se você não fizer nada, não existirão resultados (Mahatma Gandhi)",
                "O pessimista vê dificuldade em toda oportunidade. O otimista vê oportunidade em toda dificuldade (Winston Churchill)",
                "A paciência é um elemento fundamental do sucesso (Bill Gates)",
                "Reclamar não é uma estratégia. É necessário lidarmos com o mundo como ele é e não como gostaríamos que ele fosse (Jeff Bezos)",
                "O sucesso não tem a ver com o lugar de onde você veio, e sim com a confiança que você tem e o esforço que você está disposto a investir (Michelle Obama)",
                "Você pode encarar um erro como uma besteira a ser esquecida, ou como um resultado que aponta uma nova direção (Steve Jobs)",
                "Eu posso aceitar a falha, todos falham em alguma coisa. Mas eu não posso aceitar não tentar (Michael Jordan)",
                "Gostaria que você soubesse que existe dentro de si uma força capaz de mudar sua vida. Basta que lute e aguarde um novo amanhecer (Margaret Thatcher)",
                "Inteligência é a capacidade de se adaptar às mudanças (Stephen Hawking)",
                "Comemore os seus sucessos. Veja com humor os seus fracassos (Sam Walton)"
        };
        int numero = new Random().nextInt(24); //itens do array
        TextView texto = findViewById(R.id.textFrase);
        texto.setText(frases[numero]);
    }

}