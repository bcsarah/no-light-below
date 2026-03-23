import promptSync from 'prompt-sync';
import figlet from 'figlet';

const input = promptSync();

// Função para criar um cabeçalho com descrição e opções para navegação
export function title(header: string, description: string = '', options: Array<string> = []): number {
    while (true) {
        // Cabeçalho
        console.clear();
        console.log(figlet.textSync(header));

        // Descrição
        if (description) {
            for (const line of description.split('\n')) {
                console.log(`  ${line}`);
            }
            console.log()
        }

        // Opções
        if (options.length > 0) {
            let i = 1
            for (const option of options) {
                console.log(`${i} -> ${option}`)
                i++
            }

            // Entrada do Usuário
            let uinput = input('>> ');
            let uinputInt = parseInt(uinput)

            // Validação de Entrada
            if (uinput == 'quit') {
                throw Error('Process killed by user!')
            } else if (uinputInt >= 1 && uinputInt <= options.length) {
                return uinputInt
            }

        } else {
            return 0
        }
    }
}