package minesweeper.view.model

@JvmInline
value class BoardView(private val blockRows: Map<Int, BlockRowsView>) : Map<Int, BlockRowsView> by blockRows
