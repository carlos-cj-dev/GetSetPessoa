class GetSetPessoa{
    private String nome;
    private int idade;

    GetSetPessoa(){
        this.idade = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        GetSetPessoa pessoa1 = new GetSetPessoa();

        pessoa1.setNome("Carlos");
        pessoa1.setIdade(21);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

    }


}