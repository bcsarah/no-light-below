import { title } from './modules/auxiliary.ts'


// Main
function main() {
    title(
        'No Light Below',
        'Welcome to No Light Below!\nType "quit" at any time to quit game!',

        ['Play', 'Settings', 'Help', 'Credits', 'Exit']
    );
}

main()