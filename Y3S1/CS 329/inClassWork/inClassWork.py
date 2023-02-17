from emora_stdm import DialogueFlow

transitions = {
    'state': 'start',
    '`Hello. How are you?`': {
        '[{good, fantastic}]': {
            '`Glad to hear that you are doing well :)`': 'end'
        },
        '[{bad, could be better}]': {
            '`I hope your day gets better soon :(`': 'end'
        },
        '[how, you]': {
            '`I feel superb. Thank you!`': 'end'
        },
        'error': {
            '`Sorry, I didn\'t understand you.`': 'end'
        },
    }
}

df = DialogueFlow('start', end_state = 'end')
df.load_transitions(transitions)

if __name__ == '__main__':
    df.run()