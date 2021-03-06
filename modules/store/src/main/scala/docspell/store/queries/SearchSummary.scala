package docspell.store.queries

case class SearchSummary(
    count: Int,
    tags: List[TagCount],
    fields: List[FieldStats],
    folders: List[FolderCount]
)
