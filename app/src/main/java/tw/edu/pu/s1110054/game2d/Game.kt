package tw.edu.pu.s1110054.game2d

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class Game(val scope: CoroutineScope, val screenW:Int, val screenH: Int) {
    var counter = 0
    val state = MutableStateFlow(0)
    val background = Background(screenW)


    var isPlaying = true

    fun Play(){
        scope.launch {
            //counter = 0
            isPlaying = true

            while (isPlaying) {
                delay(10)
                background.Roll()
                counter++
                state.emit(counter)

            }
        }
    }
}