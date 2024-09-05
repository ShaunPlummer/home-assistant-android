package io.homeassistant.companion.android.widgets.todo

import android.content.Context
import androidx.glance.GlanceId
import androidx.glance.GlanceTheme
import androidx.glance.ImageProvider
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.components.Scaffold
import androidx.glance.appwidget.components.TitleBar
import androidx.glance.appwidget.provideContent
import androidx.glance.text.Text
import io.homeassistant.companion.android.R

/**
 * Root composable for the todo widget.
 */
class TodoListWidget : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            GlanceTheme {
                Scaffold(
                    titleBar = {
                        TitleBar(
                            startIcon = ImageProvider(R.drawable.ic_list),
                            title = "Todo"
                        )
                    },
                    backgroundColor = GlanceTheme.colors.widgetBackground
                ) {
                    Text("no items to display")
                }
            }
        }
    }
}
