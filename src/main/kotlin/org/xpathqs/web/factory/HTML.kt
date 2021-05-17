package org.xpathqs.web.factory

import org.xpathqs.core.selector.extensions.arg
import org.xpathqs.core.selector.extensions.id
import org.xpathqs.core.selector.extensions.text
import org.xpathqs.core.selector.selector.Selector
import org.xpathqs.core.selector.selector.SelectorProps
import org.xpathqs.core.util.SelectorFactory.tagSelector
import org.xpathqs.driver.selector.SecretInput

object HTML {
    fun div(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        name: String = "",
        nameContains: String = ""
    ) = tag(
        tag = "div",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        name = name,
        nameContains = nameContains
    )

    fun input(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        name: String = "",
        nameContains: String = ""
    ) = tag(
        tag = "input",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        name = name,
        nameContains = nameContains
    )

    fun span(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        name: String = "",
        nameContains: String = ""
    ) = tag(
        tag = "span",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        name = name,
        nameContains = nameContains
    )

    fun button(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        type: String = "",
        typeContains: String = ""
    ) = tag(
        tag = "button",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        type = type,
        typeContains = typeContains
    )

    fun p(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "p",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun a(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "a",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun h1(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "h1",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun h2(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "h1",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun h3(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = tag(
        tag = "h3",

        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains
    )

    fun submit(
        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = ""
    ) = button(
        id = id,
        idContains = idContains,

        text = text,
        textContains = textContains,

        title = title,
        titleContains = titleContains,

        cls = cls,
        clsContains = clsContains,

        type = "submit"
    )

    fun tag(
        tag: String = "*",

        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        type: String = "",
        typeContains: String = "",

        name: String = "",
        nameContains: String = ""
    ): Selector {
        var res = tagSelector(tag)

        if (id.isNotEmpty()) {
            res = res.id(id)
        }
        if (idContains.isNotEmpty()) {
            res = res.id(id, contains = true)
        }

        if (text.isNotEmpty()) {
            res = res.text(text)
        }
        if (textContains.isNotEmpty()) {
            res = res.text(text, contains = true)
        }

        if (title.isNotEmpty()) {
            res = res.arg("@title", title)
        }
        if (titleContains.isNotEmpty()) {
            res = res.arg("@title", titleContains, contains = true)
        }

        if (cls.isNotEmpty()) {
            res = res.arg("@class", cls)
        }
        if (clsContains.isNotEmpty()) {
            res = res.arg("@title", clsContains, contains = true)
        }

        if (type.isNotEmpty()) {
            res = res.arg("@type", type)
        }
        if (typeContains.isNotEmpty()) {
            res = res.arg("@type", type, contains = true)
        }

        if (name.isNotEmpty()) {
            res = res.arg("@name", name)
        }
        if (nameContains.isNotEmpty()) {
            res = res.arg("@name", nameContains, contains = true)
        }

        return res
    }

    fun secretInput(
        tag: String = "input",

        id: String = "",
        idContains: String = "",

        text: String = "",
        textContains: String = "",

        title: String = "",
        titleContains: String = "",

        cls: String = "",
        clsContains: String = "",

        type: String = "",
        typeContains: String = "",

        name: String = "",
        nameContains: String = ""
    ): Selector {
        var res = SecretInput(props = SelectorProps(tag = tag))

        if (id.isNotEmpty()) {
            res = res.id(id)
        }
        if (idContains.isNotEmpty()) {
            res = res.id(id, contains = true)
        }

        if (text.isNotEmpty()) {
            res = res.text(text)
        }
        if (textContains.isNotEmpty()) {
            res = res.text(text, contains = true)
        }

        if (title.isNotEmpty()) {
            res = res.arg("@title", title)
        }
        if (titleContains.isNotEmpty()) {
            res = res.arg("@title", titleContains, contains = true)
        }

        if (cls.isNotEmpty()) {
            res = res.arg("@class", cls)
        }
        if (clsContains.isNotEmpty()) {
            res = res.arg("@title", clsContains, contains = true)
        }

        if (type.isNotEmpty()) {
            res = res.arg("@type", type)
        }
        if (typeContains.isNotEmpty()) {
            res = res.arg("@type", type, contains = true)
        }

        if (name.isNotEmpty()) {
            res = res.arg("@name", name)
        }
        if (nameContains.isNotEmpty()) {
            res = res.arg("@name", nameContains, contains = true)
        }

        return res
    }
}