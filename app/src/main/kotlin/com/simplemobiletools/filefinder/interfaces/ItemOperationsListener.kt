package com.simplemobiletools.filefinder.interfaces

import com.simplemobiletools.commons.models.FileDirItem
import java.util.*

interface ItemOperationsListener {
    fun refreshItems()

    fun deleteFiles(files: ArrayList<FileDirItem>)

    fun selectedPaths(paths: ArrayList<String>)
}
