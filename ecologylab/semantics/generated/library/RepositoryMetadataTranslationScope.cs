
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metametadata;


using crit.semantics.generated.txtf1.fieldreports.emergent_event;
using crit.semantics.generated.txtf1.fieldreports.spotrep;
using ecologylab.semantics.generated.library;
using ecologylab.semantics.generated.library.artwork;
using ecologylab.semantics.generated.library.bibManaging;
using ecologylab.semantics.generated.library.british_cartoon_archive;
using ecologylab.semantics.generated.library.buzz;
using ecologylab.semantics.generated.library.camera;
using ecologylab.semantics.generated.library.creative_work;
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
using ecologylab.semantics.generated.library.movie;
using ecologylab.semantics.generated.library.nsdl;
using ecologylab.semantics.generated.library.nsf;
using ecologylab.semantics.generated.library.opml;
using ecologylab.semantics.generated.library.patents;
using ecologylab.semantics.generated.library.political_cartoon;
using ecologylab.semantics.generated.library.products;
using ecologylab.semantics.generated.library.publication;
using ecologylab.semantics.generated.library.restaurant;
using ecologylab.semantics.generated.library.rich_bookmark;
using ecologylab.semantics.generated.library.rss;
using ecologylab.semantics.generated.library.rwandatribunal;
using ecologylab.semantics.generated.library.scholarlyPublication;
using ecologylab.semantics.generated.library.scienceDirect;
using ecologylab.semantics.generated.library.search;
using ecologylab.semantics.generated.library.sfu_cartoon_archive;
using ecologylab.semantics.generated.library.slashdot;
using ecologylab.semantics.generated.library.truman_library_1948_campaign_cartoons;
using ecologylab.semantics.generated.library.tvshow;
using ecologylab.semantics.generated.library.urbanspoon;
using ecologylab.semantics.generated.library.uva;
using ecologylab.semantics.generated.library.videos;
using ecologylab.semantics.generated.library.wikipedia;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;

// Developer should proof-read this TranslationScope before using it for production.
namespace ecologylab.semantics.generated.library 
{
	public class RepositoryMetadataTranslationScope
	{
		public RepositoryMetadataTranslationScope()
		{ }

		public static SimplTypesScope Get()
		{
			return SimplTypesScope.Get("meta-metadata-compiler-tscope", MetadataBuiltinsTypesScope.Get(),
				typeof(AcmPortal),
				typeof(AcmPortalAuthor),
				typeof(AcmPortalAuthorCollaborators),
				typeof(AcmPortalInstitutionProfile),
				typeof(AcmPortalPeriodical),
				typeof(AcmPortalSearch),
				typeof(AcmPortalSearchResult),
				typeof(AdditionalMetadata),
				typeof(AmazonBook),
				typeof(AmazonList),
				typeof(AmazonProduct),
				typeof(Anchor),
				typeof(Artist),
				typeof(Artwork),
				typeof(Audience),
				typeof(Author<>),
				typeof(AuthorPhotos),
				typeof(BasicPublication),
				typeof(BingSearchApi),
				typeof(BirthDetail),
				typeof(Body),
				typeof(Book),
				typeof(Bookmark),
				typeof(BritishCartoonArchive),
				typeof(CameraSettings),
				typeof(Cast),
				typeof(Category),
				typeof(CategoryInterviews),
				typeof(Channel),
				typeof(CitationInfo),
				typeof(CiteseerxRecord),
				typeof(CiteseerxSearch),
				typeof(CiteseerxSearchResult),
				typeof(CiteseerxSummary),
				typeof(Collection),
				typeof(CommentResult),
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
				typeof(EmergentEvent),
				typeof(EmergentEventCollection),
				typeof(FastflipSearch),
				typeof(FlickrAuthor),
				typeof(FlickrPhoto),
				typeof(FlickrTagPage),
				typeof(GaurdianComic),
				typeof(General),
				typeof(GetRecordAdditionalMetadata),
				typeof(GisLocation),
				typeof(GlobeCartoon),
				typeof(GoogleBook),
				typeof(GooglePatent),
				typeof(GoogleScholarSearch),
				typeof(GoogleScholarSearchResult),
				typeof(GoogleSorry),
				typeof(GoogleTrends),
				typeof(Grant),
				typeof(GrantProgram),
				typeof(GrantStaff),
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
				typeof(ImageSearch),
				typeof(ImageSearchResult),
				typeof(ImdbTitle),
				typeof(Investigator<>),
				typeof(Item),
				typeof(ItemRecord),
				typeof(KeywordSet),
				typeof(Lifecycle),
				typeof(Lolz),
				typeof(MediaContent),
				typeof(MmArtwork),
				typeof(MobileRichBookmark),
				typeof(MobileRichBookmarkCollection),
				typeof(Model),
				typeof(MomaArtwork),
				typeof(Movie),
				typeof(Netflix),
				typeof(Nsdl),
				typeof(NsdlDocument),
				typeof(NsdlService),
				typeof(NsfAward),
				typeof(NsfDivision),
				typeof(NsfDivisionStaffList),
				typeof(NsfInvestigator),
				typeof(NsfProgram),
				typeof(NsfProgramStaffList),
				typeof(NsfSearch),
				typeof(NsfStaff),
				typeof(Opml),
				typeof(Organization),
				typeof(Outline),
				typeof(Page),
				typeof(Paragraph),
				typeof(Patent),
				typeof(PatentAuthor<>),
				typeof(PatentClassification),
				typeof(PdfMixin),
				typeof(Periodical),
				typeof(PersonnelInterview),
				typeof(PoliticalCartoon),
				typeof(PostalAddress),
				typeof(Product),
				typeof(ProductReview),
				typeof(Publication),
				typeof(PublicationDetail),
				typeof(PublicationDetailInstitution),
				typeof(Publisher),
				typeof(PubmedArticle),
				typeof(RecordMetaMetadata),
				typeof(RecordMetadata),
				typeof(Restaurant),
				typeof(RestaurantGenre),
				typeof(ResultInfo),
				typeof(Rss),
				typeof(Rss22),
				typeof(ScholarlyArticle),
				typeof(ScienceDirectArticle),
				typeof(Search<>),
				typeof(SearchAdditionalMetadataAdn),
				typeof(SearchCrumb),
				typeof(SearchMeta),
				typeof(SearchResults),
				typeof(SearchSection),
				typeof(Section),
				typeof(SfuCartoonArchive),
				typeof(SlashdotArticle),
				typeof(SlashdotItem),
				typeof(SlashdotRss),
				typeof(SlashdotSearch),
				typeof(SlashdotTag),
				typeof(SocialMediaSearch1),
				typeof(SocialMediaSearch2<>),
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
				typeof(TribunalVoices),
				typeof(TripAdvisor),
				typeof(TrumanLibrary1948CampaignCartoons),
				typeof(Tumblr),
				typeof(TumblrSearch),
				typeof(Tvshow),
				typeof(TvshowActor),
				typeof(TvshowEpisode),
				typeof(TvshowRating),
				typeof(UrbanSpoonSearch),
				typeof(UserSearchAdditionalMetadata),
				typeof(VideoInterview),
				typeof(Watchyoutubevideo),
				typeof(WeatherReport),
				typeof(WikiAnchor),
				typeof(WikipediaMobilePage),
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
