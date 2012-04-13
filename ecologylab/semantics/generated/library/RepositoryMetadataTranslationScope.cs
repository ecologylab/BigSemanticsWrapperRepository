
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metametadata;


using ecologylab.semantics.generated.library;
using ecologylab.semantics.generated.library.artwork;
using ecologylab.semantics.generated.library.bibManaging;
using ecologylab.semantics.generated.library.british_cartoon_archive;
using ecologylab.semantics.generated.library.buzz;
using ecologylab.semantics.generated.library.camera;
using ecologylab.semantics.generated.library.creativeWork;
using ecologylab.semantics.generated.library.dlese;
using ecologylab.semantics.generated.library.fastflip;
using ecologylab.semantics.generated.library.flickr;
using ecologylab.semantics.generated.library.gaurdian_comic;
using ecologylab.semantics.generated.library.globe_cartoon;
using ecologylab.semantics.generated.library.googleBooks;
using ecologylab.semantics.generated.library.gps;
using ecologylab.semantics.generated.library.hotel;
using ecologylab.semantics.generated.library.icdl;
using ecologylab.semantics.generated.library.imdb;
using ecologylab.semantics.generated.library.misc;
using ecologylab.semantics.generated.library.nsdl;
using ecologylab.semantics.generated.library.nsf;
using ecologylab.semantics.generated.library.opml;
using ecologylab.semantics.generated.library.patents;
using ecologylab.semantics.generated.library.political_cartoon;
using ecologylab.semantics.generated.library.products;
using ecologylab.semantics.generated.library.publication;
using ecologylab.semantics.generated.library.rss;
using ecologylab.semantics.generated.library.scholarlyPublication;
using ecologylab.semantics.generated.library.scienceDirect;
using ecologylab.semantics.generated.library.search;
using ecologylab.semantics.generated.library.sfu_cartoon_archive;
using ecologylab.semantics.generated.library.slashdot;
using ecologylab.semantics.generated.library.truman_library_1948_campaign_cartoons;
using ecologylab.semantics.generated.library.urbanspoon;
using ecologylab.semantics.generated.library.uva;
using ecologylab.semantics.generated.library.wikipedia;
using ecologylab.semantics.metadata.builtins.declarations;
using crit.semantics.generated.txtf1.fieldreports.spotrep;

// Developer should proof-read this TranslationScope before using it for production.
namespace ecologylab.semantics.generated.library 
{
	public class RepositoryMetadataTranslationScope
	{
		public RepositoryMetadataTranslationScope()
		{ }

		public static SimplTypesScope Get()
		{
			return SimplTypesScope.Get("meta-metadata-compiler-tscope", MetadataBuiltinsTranslationScope.Get(),
				typeof(AcmPortalSearch),
				typeof(AcmPortalSearchResult),
				typeof(AdditionalMetadata),
				typeof(AmazonBook),
				typeof(AmazonProduct),
				typeof(Anchor),
				typeof(Artist),
				typeof(Artwork),
				typeof(Audience),
				typeof(Author),
				typeof(AuthorPhotos),
				typeof(BasicPublication),
				typeof(BestsellerList),
				typeof(BingImageSearchResult),
				typeof(BingSearch),
				typeof(BingSearchImageSection),
				typeof(BingSearchWebSection),
				typeof(BingWebSearchResult),
				typeof(BirthDetail),
				typeof(Body),
				typeof(Book),
				typeof(Bookmark),
				typeof(BritishCartoonArchive),
				typeof(CameraSettings),
				typeof(CastMember),
				typeof(Category),
				typeof(Channel),
				typeof(CitationInfo),
				typeof(CiteseerxRecord),
				typeof(CiteseerxSearch),
				typeof(CiteseerxSearchResult),
				typeof(CiteseerxSummary),
				typeof(Collection),
				typeof(ContactPoint),
				typeof(Contributor),
				typeof(CreativeWork),
				typeof(DateInfo),
				typeof(Dc),
				typeof(DcDocument),
				typeof(DeliciousHomepage),
				typeof(DeliciousSearch),
				typeof(DleseGetRecord),
				typeof(DleseRecord),
				typeof(DleseRecord1),
				typeof(DleseRecord2),
				typeof(DleseRecordHead),
				typeof(DleseUserSearch),
				typeof(Dlms),
				typeof(DocumentSet),
				typeof(Educational),
				typeof(FastflipSearch),
				typeof(FlickrAuthor),
				typeof(FlickrGroups),
				typeof(FlickrImageDetail),
				typeof(FlickrImageDetailTwo),
				typeof(FlickrLink),
				typeof(FlickrNearby),
				typeof(FlickrNearbySearchResult),
				typeof(FlickrSearch),
				typeof(FlickrSearchTwo),
				typeof(FlickrTag),
				typeof(FlickrTags),
				typeof(FlickrTagsInteresting),
				typeof(GaurdianComic),
				typeof(General),
				typeof(Genre),
				typeof(GetRecordAdditionalMetadata),
				typeof(GisLocation),
				typeof(GlobeCartoon),
				typeof(GoogleBook),
				typeof(GoogleImageSearchPage),
				typeof(GoogleImageSearchType),
				typeof(GooglePatent),
				typeof(GoogleScholarSearch),
				typeof(GoogleScholarSearchResult),
				typeof(GoogleSorry),
				typeof(GoogleTrends),
				typeof(Head),
				typeof(Head1),
				typeof(Head2),
				typeof(Header),
				typeof(HotSearch),
				typeof(Hotel),
				typeof(IcdlBook),
				typeof(IcdlBookPreview),
				typeof(IcdlImage),
				typeof(IcdlImageResult),
				typeof(ImageInSearchResult),
				typeof(ImageResult),
				typeof(ImdbChart),
				typeof(ImdbGenre),
				typeof(ImdbTitle),
				typeof(Investigator),
				typeof(Item),
				typeof(ItemRecord),
				typeof(KeywordSet),
				typeof(Lifecycle),
				typeof(Lolz),
				typeof(MediaContent),
				typeof(MmArtwork),
				typeof(Model),
				typeof(MomaArtwork),
				typeof(Nsdl),
				typeof(NsdlDocument),
				typeof(NsdlService),
				typeof(NsfAward),
				typeof(NsfAwardSearch),
				typeof(Opml),
				typeof(Organization),
				typeof(Outline),
				typeof(Page),
				typeof(Paragraph),
				typeof(Patent),
				typeof(PdfMixin),
				typeof(Periodical),
				typeof(PersonDetails),
				typeof(PoliticalCartoon),
				typeof(PostalAddress),
				typeof(Product),
				typeof(ProductReview),
				typeof(Publication),
				typeof(Publisher),
				typeof(RecordMetaMetadata),
				typeof(RecordMetadata),
				typeof(Restaurant),
				typeof(ResultInfo),
				typeof(Rss),
				typeof(Rss22),
				typeof(ScholarlyArticle),
				typeof(ScienceDirectArticle),
				typeof(Search),
				typeof(SearchAdditionalMetadataAdn),
				typeof(SearchResult),
				typeof(SearchResults),
				typeof(SearchSection),
				typeof(SfuCartoonArchive),
				typeof(SlashdotArticle),
				typeof(SlashdotItem),
				typeof(SlashdotRss),
				typeof(SlashdotSearch),
				typeof(SlashdotTag),
				typeof(SocialMediaSearchResult),
                typeof(Spotrep),
				typeof(Subject),
				typeof(Tag),
				typeof(TempFieldValueHolder),
				typeof(TermType),
				typeof(Thumbinner),
				typeof(Thumbnail),
				typeof(Topic),
				typeof(TopicCluster),
				typeof(TrumanLibrary1948CampaignCartoons),
				typeof(Tumblr),
				typeof(TumblrSearch),
				typeof(UrbanSpoonGenre),
				typeof(UserSearchAdditionalMetadata),
				typeof(WeatherReport),
				typeof(WikiAnchor),
				typeof(WikipediaPage),
				typeof(WikipediaPageType),
				typeof(YahooGeoCode),
				typeof(YahooGeoCodeResult),
				typeof(YahooMediaRss),
				typeof(YahooResult),
				typeof(YahooResultSet),
				typeof(YahooThumbnail));
		}
	}
}
