package se.lexicon.javagroup30.data;

import javax.sound.midi.Sequence;

    public class PersonSequencer {
        private static int personId=0;

        public static int nextPersonId(){
            return ++personId;
        }
        public static int multiPersonId(){
            return personId *10;
        }
        public static void reset(){
            personId=0;
        }
    }


