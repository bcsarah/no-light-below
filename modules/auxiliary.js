import promptSync from 'prompt-sync';
import figlet from 'figlet';

const input = promptSync();

// Função para criar um cabeçalho com descrição e opções para navegação
export function entitular(cabeçalho, descrição='', opções=[]) {
    while (true) {
        // Cabeçalho
        console.clear();
        console.log(figlet.textSync(cabeçalho));

        // Descrição
        if (descrição) {
            for (const linha of descrição.split('\n')) {
                console.log(`  ${linha}`);
            }
            console.log()
        }

        // Opções
        if (opções.length > 0) {
            let i = 1
            for (const opção of opções) {
                console.log(`${i} -> ${opção}`)
                i++
            }

            // Entrada do Usuário
            let entrada = input('>> ');
            let entradaInt = parseInt(entrada)

            // Validação de Entrada
            if (entrada == 'sair' || entrada == 'quit') {
                process.exit();
            } else if (entradaInt >= 1 && entradaInt <= opções.length) {
                return entradaInt
            }

        } else {
            break
        }
    }
}