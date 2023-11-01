public class Evento {
    String nome;
    String data;
    String local;
    int maxParticipantes;
    Aluno[] listaParticipantes;
    int numParticipantes;

    public Evento(String nome, String data, String local, int maxParticipantes) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.maxParticipantes = maxParticipantes;
        this.listaParticipantes = new Aluno[maxParticipantes];
        this.numParticipantes = 0;
    }

    public void inscreverParticipante(Aluno aluno) {
        if (numParticipantes < maxParticipantes) {
            listaParticipantes[numParticipantes] = aluno;
            numParticipantes++;
            System.out.println("Inscrição realizada com sucesso!");
        } else {
            System.out.println("Não há mais vagas para este evento.");
        }
    }

    public Aluno[] getListaParticipantes() {
        return listaParticipantes;
    }
}


