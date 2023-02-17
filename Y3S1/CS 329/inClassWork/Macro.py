# Creation
from emora_stdm import Macro, Ngrams
from typing import Dict, Any, List

class MacroGetName(Macro):
    # Need to override
    def run(self, ngrams: Ngrams, vars: Dict[str, Any], args: List[Any]):
        return True

# Integration
transitions = {
    'state': 'start',
    '`Hello. What should I call you?`': {
        '#GET_NAME': { # use in the natex; when it reaches GET_NAME it executes the run method
            '`It\'s nice to meet you.`': 'end'
        },
        'error': {
            '`Sorry, I didn\'t understand you.`': 'end'
        }
    }
}

macros = { # Create a new dicionary
    'GET_NAME': MacroGetName() # key is the name; value is the class
}

df = DialogueFlow('start', end_state='end')
df.load_transitions(transitions)
df.add_macros(macros) # you need to load the macro when you run

# Parameters
def run(self, ngrams: Ngrams, vars: Dict[str, Any], args: List[Any]):
    print(ngrams.raw_text()) # gets the the raw text from the original input
    print(ngrams.text()) # gives lower case version of the input
    print(ngrams) # gives a set of all possible n - grams in text()
    print(vars) # gives system and user - made variables