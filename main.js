const input = require('prompt-sync')();
const figlet = require('figlet');

// Função para criar um cabeçalho com descrição e opções para navegação
function entitular(cabeçalho, descrição, opções) {
    while (true) {
        // Cabeçalho
        console.clear();
        console.log(figlet.textSync(cabeçalho));

        // Descrição
        const descriçãoDividida = descrição.split('\n');
        for (linha in descriçãoDividida) {
            console.log(`  ${descriçãoDividida[linha]}`);
        }
        console.log()

        // Opções
        let i = 1
        for (opção in opções) {
            console.log(`${i} -> ${opções[opção]}`)
            i++
        }

        // Entrada do Usuário
        let entrada = input('>> ');
        let entradaInt = parseInt(entrada)

        // Validação de Entrada
        if (entrada == 'sair') {
            process.exit();
        } else if (entradaInt >= 1 && entradaInt <= opções.length) {
            return entradaInt
        }
    }
}


// Main
function main() {
    entitular(
        'No Light Below',
        'Bem-vindo ao melhor\nJogo em terminal que você já viu!',
        ['Jogar', 'Configurações', 'Ajuda', 'Créditos', 'Sair']
    );
}

main()